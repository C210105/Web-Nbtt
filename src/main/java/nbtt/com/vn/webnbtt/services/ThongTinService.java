package nbtt.com.vn.webnbtt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import nbtt.com.vn.webnbtt.beans.ThongTin;
import nbtt.com.vn.webnbtt.mappers.ThongTinMapper;

public class ThongTinService {
    
    @Autowired
    ThongTinMapper thongTinMapper;
    public List <ThongTin> getThongTin(){
        return thongTinMapper.selectAll(); 
    }
}
