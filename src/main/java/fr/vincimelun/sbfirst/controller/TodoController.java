package fr.vincimelun.sbfirst.controller;

import fr.vincimelun.sbfirst.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    List<String> todos = new ArrayList<String>();


@GetMapping("/todo")
    public String todoForm(Model model, HttpSession session) {
    if (session.isNew()){
    session.setAttribute("todos",new ArrayList<String>());
    }
    model.addAttribute("todos",todos);
    model.addAttribute("todoSession",(List<String>)session.getAttribute("todos"));
    return "todoform";
}

@PostMapping("/todo")
    public  String todoDisplay(@ModelAttribute Todo task, Model model, HttpSession session){
    if("session".equals(task.getScope())){
        List<String > todos = (List<String>)session.getAttribute("todos");
        todos.add(task.getTask());
    }
    else{
        todos.add(task.getTask());
    }

    return "redirect:/todo";

}
}
