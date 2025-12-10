package com.guilherme.usuario.business;

import com.guilherme.usuario.infrastructure.clients.ViaCepClient;
import com.guilherme.usuario.infrastructure.clients.ViaCepDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ViaCepService {

    private final ViaCepClient client;

    public ViaCepDTO buscarDadosEndereco(String cep) {
        return client.buscarDadosEndereco(processarCep(cep));
    }

    private String processarCep(String cep) {
        String cepFormatado = cep.replace(" ", "").
                replace("-", "");

        if (!cepFormatado.matches("\\d{8}")
                || !Objects.equals(cepFormatado.length(),8)) {
            throw new IllegalArgumentException("O cep contem caracteres inválidos, favor verificar");
        }

        return cepFormatado;
    }
}
