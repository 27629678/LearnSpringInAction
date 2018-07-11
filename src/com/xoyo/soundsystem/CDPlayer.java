package com.xoyo.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    // 该注解不仅可用于构造器上，还能用在属性的Setter方法及类内的其它任意方法
    // 作用：声明依赖关系
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

    // @Inject
    // 若没有在应用上下文中找到对应的依赖，通过设置required属性为false可避免异常出现
    @Autowired(required = false)
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }
}
