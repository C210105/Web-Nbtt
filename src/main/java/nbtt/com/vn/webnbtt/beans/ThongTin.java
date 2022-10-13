package nbtt.com.vn.webnbtt.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThongTin {
    
    private Integer so; // Stt 順番
    private String ten; // 名
    private String hangSanXuat; // 製
    private String loai;    // 種類
    private Integer gia;    //  値段
    private String ma;      // ID
    private String tacDung; // 用
    private Integer tonKho; //残り

    SanPham sanPham;
}
