import { useEffect, useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";

function App() {
  const [platos, setPlatos] = useState([]);
  const [form, setForm] = useState({
    nombre: "",
    n_platos: 1,
    precio: 0
  });

  // Cargar lista desde el backend
  useEffect(() => {
    fetch("http://localhost:8080/api/platos")
      .then((res) => res.json())
      .then((data) => setPlatos(data));
  }, []);

  // Enviar nuevo plato al backend
  const handleSubmit = async (e) => {
    e.preventDefault();

    const res = await fetch("http://localhost:8080/api/platos", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(form),
    });

    const saved = await res.json();
    setPlatos([...platos, saved]);

    // Resetear formulario
    setForm({ nombre: "", n_platos: 1, precio: 0 });
  };

  return (
    <div className="container mt-4">
      <h1>Carta de la Cafetería</h1>

      <form className="row g-2 mb-3" onSubmit={handleSubmit}>
        <div className="col-auto">
          <input
            className="form-control"
            placeholder="Nombre del plato"
            value={form.nombre}
            onChange={(e) => setForm({ ...form, nombre: e.target.value })}
            required
          />
        </div>

        <div className="col-auto">
          <input
            type="number"
            className="form-control"
            placeholder="Número de platos"
            value={form.n_platos}
            min="1"
            onChange={(e) =>
              setForm({ ...form, n_platos: Number(e.target.value) })
            }
          />
        </div>

        <div className="col-auto">
          <input
            type="number"
            step="0.01"
            className="form-control"
            placeholder="Precio (€)"
            value={form.precio}
            onChange={(e) =>
              setForm({ ...form, precio: Number(e.target.value) })
            }
          />
        </div>

        <div className="col-auto">
          <button className="btn btn-primary" type="submit">
            Añadir plato
          </button>
        </div>
      </form>

	  <ul className="list-group">
	    {platos.map((p) => (
	      <li key={p.id} className="list-group-item d-flex justify-content-between">
	        <span>
	          <strong>{p.nombre}</strong> — {p.n_platos} uds — {Number(p.precio).toFixed(2)} €
	        </span>
	      </li>
	    ))}
	  </ul>

    </div>
  );
}

export default App;
