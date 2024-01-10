package com.eightbit.blog.models.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDto<T> implements Serializable {
    private T data;
    private String msg;
}
