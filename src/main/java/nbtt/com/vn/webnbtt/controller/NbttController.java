package nbtt.com.vn.webnbtt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import nbtt.com.vn.webnbtt.beans.SanPham;
import nbtt.com.vn.webnbtt.beans.ThongTin;

@Controller
public class NbttController {
    
    @GetMapping("/Tracuu")
    public String showTracuu(Model model){

        // Thông tin loại sản phẩm
        List <SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("R1", "Ruou"));

        // Thông tin sản phẩm
        List <ThongTin> thongTins = new ArrayList<>();
        thongTins.add(new ThongTin(1, "Yamayaki", "Nhat Ban", "Ruou", 1500000, "R1", "#", 1, new SanPham("R1", "Ruou")));

        model.addAttribute("sanPhams", sanPhams);
        model.addAttribute("thongTins", thongTins);
        return "Tracuu";
    }
}
