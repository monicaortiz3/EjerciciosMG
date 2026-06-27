const fecha = document.getElementById('fecha');
const hora = document.getElementById('hora');

async function fechaHoraActual(fecha, hora) {
    console.log('Entro');
    try {
        const response = await fetch('http://localhost:8081/api/v1/fecha-hora-actual');

        const data = await response.json();

        fecha.textContent = data.fecha;
        hora.textContent = data.hora;
    }
    catch (error) {
        console.error('Error al obtener la fecha y hora actual:', error);
    }
}
fechaHoraActual(fecha, hora);
