package pedromarineli.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pedromarineli.models.Professor;
import pedromarineli.repositories.ProfessorRepository;

@Controller
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepo;

    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("professor", this.professorRepo.findAll());
        return "list";
    }

    @RequestMapping("insert")
    public String insert() {
        return "insert";
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(@RequestParam("nome") String nome, @RequestParam("componente") String componente) {
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setComponente(componente);
        professorRepo.save(professor);
        return "redirect:/professor/list";
    }

    @RequestMapping("update/{id}")
    public String update(Model model, @PathVariable int id) {
        Optional<Professor> professor = professorRepo.findById(id);
        model.addAttribute("professor", professor.get());
        return "/professor/update";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String saveUpdate(
        @RequestParam("nome") String nome,
        @RequestParam("componente") String componente,
        @RequestParam("id") int id) {
            Optional<Professor> professor = professorRepo.findById(id);
            professor.get().setNome(nome);
            professor.get().setComponente(componente);
            professorRepo.save(professor.get());
            return "redirect:/professor/list";
    }

    @RequestMapping("delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        Optional<Professor> professor = professorRepo.findById(id);
        model.addAttribute("professor", professor.get());
        return "/professor/delete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String saveDelete(@RequestParam("id") int id) {
        professorRepo.deleteById(id);

        return "redirect:/professor/list";
    }
}