package br.com.denisio.shortURL;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UrlData {
    private String originalURL;
    private long expirationTime;
}
