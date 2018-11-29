package ee.sdacademy.thymleaf.contacts.controllers;

import ee.sdacademy.thymleaf.contacts.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ee.sdacademy.thymleaf.contacts.services.ContactService;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexPageController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("allcontacts", contactService.getAll());
        return "index";
    }

    @GetMapping("/view")
    public String viewContact(@RequestParam Integer id, Model model){
        model.addAttribute("contact", contactService.get(id));
        model.addAttribute("phones", contactService.findPhonesById(id));
        return "view";
    }

    @GetMapping("/addContact")
    public String createContact(Model model){
        model.addAttribute("newContact",true);
        model.addAttribute("contact",new Contact());
        return "addContact";
    }
}
