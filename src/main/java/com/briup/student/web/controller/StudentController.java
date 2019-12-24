package com.briup.student.web.controller;

import com.briup.student.bean.Student;
import com.briup.student.util.Message;
import com.briup.student.util.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController

public class StudentController {
    //新增修改用post,删除
    @PostMapping("/add")
    @ApiOperation(value ="添加学生")
    public Message add(Student student){
//       Message<String> message= new Message<>();
//       Date date = new Date();
//       message.setTime(date.getTime());
//       message.setStatus(200);
//       message.setMessage("success");
//       message.setData("添加学生成功");

       // return message;
        return  MessageUtil.success("添加学生成功");
    }
    @GetMapping("delete")
    @ApiOperation(value="删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "stuId",value ="学号",paramType = "query",dataType = "int",required = true),
            @ApiImplicitParam(name = "name",value ="姓名",paramType = "query",dataType = "string")
    })
    public Message delete(int stuId,String name){
        return  MessageUtil.success("删除学生成功");
    }
}
