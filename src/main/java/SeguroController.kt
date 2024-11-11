import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/seguros")
class SeguroController() {

    @Autowired
    private lateinit var seguroService: SeguroService

    @PostMapping
    fun addSeguro(@RequestBody seguro: Seguro): ResponseEntity<String> {
        return ResponseEntity.ok(seguroService.addSeguro(seguro))
    }

    @GetMapping
    fun getSeguros(): ResponseEntity<List<Seguro>>{
        return ResponseEntity.ok(seguroService.getSeguros())
    }

    @GetMapping("/{id}")
    fun getSeguro(@PathVariable id : Int): ResponseEntity<Seguro> {
        val seg = seguroService.getSeguro(id)
        return if (seg!=null) ResponseEntity.ok(seg) else ResponseEntity.notFound().build()
    }

    @DeleteMapping("/{id}")
    fun deleteSeguro(@PathVariable id: Int):ResponseEntity<String>{
        return ResponseEntity.noContent().build()
    }
}