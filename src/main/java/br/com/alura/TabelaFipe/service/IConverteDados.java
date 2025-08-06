package br.com.alura.TabelaFipe.service;

import java.util.List;

public interface IConverteDados {
    <T> T obterdados(String json, Class<T> classe);

    <T> List<T> obterlista(String json, Class<T> classe);
}
