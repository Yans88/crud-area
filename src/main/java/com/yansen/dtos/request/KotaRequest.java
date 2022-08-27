package com.yansen.dtos.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
public class KotaRequest implements Serializable {
    private Long id_kota;

    @NotEmpty(message = "Nama Kota is required")
    private String nama_kota;
}
