package com.eightbit.blog.models;

import java.io.Serializable;

public class ResponseDto<T> implements Serializable {
    private T data;
}
