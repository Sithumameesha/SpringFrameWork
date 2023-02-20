package lk.ijse.Spring.spring.controller;

import lk.ijse.Spring.spring.Dto.CustomerDto;
import lk.ijse.Spring.spring.Dto.ItemDto;
import lk.ijse.Spring.spring.Utill.ResponseUtill;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/items")
public class ItemController {
    @PostMapping
    public ResponseUtill SaveItem(@ModelAttribute ItemDto dto){
        System.out.println("Wade Hri");
        System.out.println(dto.toString());
        return new ResponseUtill("Ok","Successfully Login",null);
    }
    @DeleteMapping(params = {"code"})
    public ResponseUtill deleteItem( @RequestParam String code){
        return new ResponseUtill("Ok","Successfully Deleted",null);

    }
    @PutMapping
    public ResponseUtill updateItem(@RequestBody ItemDto dto){
        return new ResponseUtill("Ok","Successfully Updated"+dto.getCode(),null);
    }
    @GetMapping
    public ResponseUtill getAllItem(){
        ArrayList<ItemDto> arrayList=new ArrayList<>();
        arrayList.add(new ItemDto("C001","Sithum",120,1000));
        arrayList.add(new ItemDto("C002","Sithum",130,2000));
        arrayList.add(new ItemDto("C003","Sithum",140,3000));
        arrayList.add(new ItemDto("C004","Sithum",150,4000));


        return new ResponseUtill("Ok","Successfully Loaded",arrayList);
    }
}
