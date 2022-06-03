package com.kuang.rui.mapper;

import com.kuang.rui.pojo.Club;
import com.kuang.rui.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * @Description: @Mapper注解，能够扫描mapper接口，生成的代理对象
 * @Author: Wang Rui
 * @Date: $
 */
@Mapper
@Repository
public interface ClubMapper {
    //获得所有社团信息
    List<Club> getClub();

//    //通过id获得社团
    Club getClubById(Integer id);



    //删除社团
    int deleteClubById(@Param("id") long id);
    //添加社团
    int addClub(Club club);
    //    修改社团
    int updateClub(Club club);




}
