public class Data {
    public interface AlunoRepository extends JpaRepository<Aluno, Long> {}

    public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long> {}

    public interface MatriculaRepository extends JpaRepository<Matricula, Long> {}

    @RestController
    @RequestMapping("/alunos")
    public class AlunoController {
        @Autowired
        private AlunoRepository alunoRepository;

        @GetMapping
        public List<Aluno> getAll() {
            return alunoRepository.findAll();
        }

        @GetMapping("/{id}")
        public Aluno getById(@PathVariable Long id) {
            return alunoRepository.findById(id).orElse(null);
        }

        @PostMapping
        public Aluno create(@RequestBody Aluno aluno) {
            return alunoRepository.save(aluno);
        }

        @PutMapping("/{id}")
        public Aluno update(@PathVariable Long id, @RequestBody Aluno aluno) {
            aluno.setId(id);
            return alunoRepository.save(aluno);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
            alunoRepository.deleteById(id);
        }
    }

    @RestController
    @RequestMapping("/avaliacoes-fisicas")
    public class AvaliacaoFisicaController {
        @Autowired
        private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

        @GetMapping
        public List<AvaliacaoFisica> getAll() {
            return avaliacaoFisicaRepository.findAll();
        }

        @GetMapping("/{id}")
        public AvaliacaoFisica getById(@PathVariable Long id) {
            return avaliacaoFisicaRepository.findById(id).orElse(null);
        }

        @PostMapping
        public AvaliacaoFisica create(@RequestBody AvaliacaoFisica avaliacaoFisica) {
            return avaliacao
}
