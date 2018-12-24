package cn.augusto.ch3.annos;

import cn.augusto.utils.AugConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

@AugConfig("cn.augusto.ch3.annos")
public @interface AnnoConfig {
}
