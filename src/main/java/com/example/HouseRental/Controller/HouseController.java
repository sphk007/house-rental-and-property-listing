package com.example.HouseRental.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.HouseRental.Model.House;
import com.example.HouseRental.service.HouseService;

@Controller
public class HouseController {

    @Autowired
    private HouseService houseService;

    // Display list of Houses
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listHouses", houseService.getAllHouses());
        return "index";
    }

    @GetMapping("/showNewHouseForm")
    public String showNewHouseForm(Model model) {
        // Create model attribute to bind form data
        House house = new House();
        model.addAttribute("house", house);
        return "new_house"; // corrected view name to follow naming convention
    }

    @PostMapping("/saveHouse")
    public String saveHouse(@ModelAttribute("house") House house) {
        // Save House to database
        houseService.saveHouse(house);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        // Get House from the service
        House house = houseService.getHouseById(id);
        if (house == null) {
            // Handle the case where house is not found
            // You can redirect to an error page or handle it in a different way
            return "error"; // for example
        }
        // Set House as a model attribute to pre-populate the form
        model.addAttribute("house", house);
        return "update_house"; // corrected view name to follow naming convention
    }

    @GetMapping("/deleteHouse/{id}")
    public String deleteHouse(@PathVariable(value = "id") long id) {
        // Call delete House method
        houseService.deleteHouseById(id);
        return "redirect:/";
    }
}
