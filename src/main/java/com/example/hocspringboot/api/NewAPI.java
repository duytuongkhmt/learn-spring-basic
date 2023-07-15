package com.example.hocspringboot.api;

import com.example.hocspringboot.api.output.NewOutput;
import com.example.hocspringboot.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import com.example.hocspringboot.dto.NewDTO;

@CrossOrigin
@RestController
public class NewAPI {
    @Autowired
    private INewService newService;

    @GetMapping(value = "/new")
    public NewOutput showNew(@RequestParam("page") int page,
                             @RequestParam("limit") int limit) {
        NewOutput result = new NewOutput();
        result.setPage(page);
        Pageable pageable = PageRequest.of(page-1,limit);
        result.setListResult(newService.findAll(pageable));
        result.setTotalPage((int) Math.ceil((double) (newService.totalItem()) / limit));
        return result;
    }

    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model) {

        return newService.save(model);
    }

    @PutMapping(value = "/new/{id}")
    public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") long id) {
        model.setId(id);
        return newService.save(model);
    }

    @DeleteMapping(value = "/new")
    public void deleteNew(@RequestBody long[] ids) {
            newService.delete(ids);
    }
}