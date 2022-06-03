package com.kuang.rui.service;

import com.kuang.rui.pojo.Club;
import com.kuang.rui.pojo.Student;
import org.springframework.ui.Model;

import java.util.List;

/***
 * @Description:
 * @Author: Su Jun
 * @Date: $
 */
public interface ClubService {
//    //查询全部社团信息
//    List<Club> getAllD();

    //获取全部社团
    String getClub(Model model);
    //删除社团
    String deleteClub(Model model,Integer id);
    //增加社团
    String toaddClub(Model model);
    String addClub(Club club);


     Club getClubById(Integer id);
    //    修改员工信息
    String toupdateClub(Integer id, Model model);
    String updateClub(Club club);
}
