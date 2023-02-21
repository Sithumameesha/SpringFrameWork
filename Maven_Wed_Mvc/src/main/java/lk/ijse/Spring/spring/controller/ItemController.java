package lk.ijse.Spring.spring.controller;

import lk.ijse.Spring.spring.Dto.CustomerDto;
import lk.ijse.Spring.spring.Dto.ItemDto;
import lk.ijse.Spring.spring.Entity.Customer;
import lk.ijse.Spring.spring.Entity.Item;
import lk.ijse.Spring.spring.Repo.ItemRepo;
import lk.ijse.Spring.spring.Utill.ResponseUtill;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemRepo itemRepo;

    @Autowired
    private ModelMapper mapper;
    @PostMapping
    public ResponseUtill SaveItem(@ModelAttribute ItemDto dto){
       if (itemRepo.existsById(dto.getCode())){
           throw new RuntimeException("Item Already Exist. Please enter another Code..!");
       }
        Item map = mapper.map(dto, Item.class);
        itemRepo.save(map);
        return new ResponseUtill("Ok","Successfully Login",null);
    }
    @DeleteMapping(params = {"code"})
    public ResponseUtill deleteItem( @RequestParam String code){
        if (itemRepo.existsById(code)){
            itemRepo.deleteById(code);
            return new ResponseUtill("Ok","Successfully Deleted",null);

        }
        throw new RuntimeException("Try Again");


    }
    @PutMapping
    public ResponseUtill updateItem(@RequestBody ItemDto dto){

        if (itemRepo.existsById(dto.getCode())){
            Item map = mapper.map(dto, Item.class);
            itemRepo.save(map);
            return new ResponseUtill("Ok","Successfully Updated"+dto.getCode(),null);
        }
        throw new RuntimeException("Try Again");
    }
    @GetMapping
    public ResponseUtill getAllItem(){
        List<Item> all = itemRepo.findAll();


        return new ResponseUtill("Ok","Successfully Loaded",all);
    }
}
