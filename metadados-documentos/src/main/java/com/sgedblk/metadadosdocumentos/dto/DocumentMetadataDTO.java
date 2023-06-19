package com.sgedblk.metadadosdocumentos.dto;

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
    private String docInfo;
    private String docHash;
    private LocalDateTime date;
    private Integer version;
}
