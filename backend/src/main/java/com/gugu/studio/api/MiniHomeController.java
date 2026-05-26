package com.gugu.studio.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/mini")
public class MiniHomeController {

    @GetMapping("/home")
    public Map<String, Object> home() {
        return Map.of(
                "brand", "GUGU",
                "tabs", List.of("首页", "作品", "品牌", "我的"),
                "quickActions", List.of("电话", "微信", "导航", "分享"),
                "sections", List.of(
                        Map.of("key", "works", "title", "作品", "subtitle", "WORKS"),
                        Map.of("key", "brand", "title", "品牌", "subtitle", "BRAND")
                )
        );
    }
}
