package ait.fixer.dto;

import lombok.Getter;

import java.util.Map;

@Getter
public class FixerResult {
    private String success;
    private String date;
    private String result;
    private Map<String, String> query;
}
