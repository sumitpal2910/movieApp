package com.eightbit.blog.models.dto;

import java.io.Serializable;

public class ResponseDto<T> implements Serializable {
    private T data;
}
