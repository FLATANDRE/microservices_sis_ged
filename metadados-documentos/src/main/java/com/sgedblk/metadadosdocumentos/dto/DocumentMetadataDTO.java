package com.sgedblk.metadadosdocumentos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentMetadataDTO {
    private String id;
    @NonNull
    private String user = "";
    @NonNull
    private String docCID = "";
    @NonNull
    private String docName = "";
    @NonNull
    private String docInfo = "";
    @NonNull
    private String docHash = "";
    private LocalDateTime date;
    private Integer version;
}
