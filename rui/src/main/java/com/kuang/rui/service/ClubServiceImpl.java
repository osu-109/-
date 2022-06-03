package com.kuang.rui.service;

import com.kuang.rui.mapper.ClubMapper;
import com.kuang.rui.pojo.Club;
import com.kuang.rui.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

/***
 * @Description:
 * @Author: Su Jun
 * @Date: $
 */
@Service
public class ClubServiceImpl implements ClubService {
    @Autowired
    ClubMapper clubMapper;

    @Override
    public String getClub(Model model) {
        List<Club> clubs=clubMapper.getClub();
        model.addAttribute("club",clubs);
        return "emp2/clublist";
    }

    @Override
    public String deleteClub(Model model, Integer id) {
        clubMapper.deleteClubById(id);
        return "redirect:/con";
    }

    @Override
    public String toaddClub(Model model) {
        List<Club> clubList = clubMapper.getClub();
        model.addAttribute("clubList", clubList);
        return "emp2/addclub";
    }

    @Override
    public String addClub(Club club) {
        clubMapper.addClub(club);
        return "redirect:/con";
    }

    @Override
    public Club getClubById(Integer id) {
        return clubMapper.getClubById(id);
    }

    @Override
    public String toupdateClub(Integer id, Model model) {
        Club club = clubMapper.getClubById(id);
        model.addAttribute("pro", club);

        List<Club> clubs = clubMapper.getClub();
        model.addAttribute("clubadd", clubs);

        return "emp2/clubupdate";
    }

    @Override
    public String updateClub(Club club) {
        clubMapper.updateClub(club);
        return "redirect:/con";
    }




}
