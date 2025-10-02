package edu.udb.jetpackcomposeapp.viewmodel
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import edu.udb.jetpackcomposeapp.data.sampleCarreras
import edu.udb.jetpackcomposeapp.model.Materia

class CarrerasViewModel: ViewModel() {
        private val _carreras = mutableStateOf(sampleCarreras)
        val carreras: State<Map<String, List<Materia>>> = _carreras
        fun buscarMateriaPorCodigo(codigo: String): Materia? {
            return _carreras.value.values.flatten().firstOrNull { it.codigo ==
                    codigo }
        }
}