package com.sgedblk.metadadosdocumentos.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class DocumentMetadataDTO {
    private String id;
    private String user;
    private String docCID;
    private Date date;
    private Integer version;
}
