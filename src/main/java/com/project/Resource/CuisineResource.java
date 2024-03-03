package com.project.Resource;

import com.project.model.FoodDetail;
import com.project.service.CuisineDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cuisine")
public class CuisineResource {
    @Autowired
    private CuisineDataService cuisineDataService;
    @CrossOrigin
    @GetMapping("/cuisineList/{userId}")
    public List<String> getCuisineList(@PathVariable int userId){
        System.out.println("test app....");
        return cuisineDataService.getCuisineList(userId).getCuisineList();
    }

    @CrossOrigin
    @GetMapping("/itemList/{cuisine}")
    public List<String> getItemList(@PathVariable String cuisine){
        System.out.println("test app....");
        return cuisineDataService.getItemList(cuisine).getItemList();
    }

    @CrossOrigin
    @GetMapping("/itemDetail/{foodItem}")
    public FoodDetail getItemDetail(@PathVariable String foodItem){
        return cuisineDataService.getItemDetail(foodItem);
    }


    @GetMapping("/test")
    public String test(){
        return "tested!";
    }


}
