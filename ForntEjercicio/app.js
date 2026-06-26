fetch("http://localhost:8081/api/v1/fecha-hora-actual")
    .then(response => response.json())
    .then(data => {
        document.getElementById("fecha").textContent = data.fecha;
        document.getElementById("hora").textContent = data.hora;
    })
    .catch(error => console.error("Error:", error));