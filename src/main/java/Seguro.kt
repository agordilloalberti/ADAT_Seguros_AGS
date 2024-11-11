import java.util.*
import jakarta.persistence.*

@Entity
@Table(name = "Seguros")
data class Seguro(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idSeguro: Int?,

    @Column(nullable = false)
    val nif: String,

    @Column(nullable = false)
    val nombre: String,

    @Column(nullable = false)
    val ape1: String,

    val ape2: String?,

    @Column(nullable = false)
    val edad: Int,

    @Column(nullable = false)
    val numHijos: Int,

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    val fechaCreacion: Date,

    @Column(nullable = false)
    val sexo: String,

    @Column(nullable = false)
    val casado: Boolean,

    @Column(nullable = false)
    val embarazada: Boolean
)
