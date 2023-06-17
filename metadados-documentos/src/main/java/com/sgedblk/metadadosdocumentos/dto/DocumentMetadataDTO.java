package com.sgedblk.metadadosdocumentos.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentMetadataDTO {
    private String id;
    private String user;
    private String docCID;
    private String docName;
    private LocalDateTime date;
    private Integer version;
}
