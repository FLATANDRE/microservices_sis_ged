package com.sgedblk.metadadosdocumentos.controller;

import com.sgedblk.metadadosdocumentos.dto.DocumentMetadataDTO;
import com.sgedblk.metadadosdocumentos.entity.DocumentMetadata;
import com.sgedblk.metadadosdocumentos.service.DocumentMetadataService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@RestController
@RequestMapping("/documentMetadata")
public class DocumentMetadataController {

    private DocumentMetadataService documentMetadataService;
    private ModelMapper modelMapper;

    @GetMapping(value = "/{docCID}")
    public DocumentMetadataDTO findByDocCID(@PathVariable String docCID) {
        DocumentMetadata doc = documentMetadataService.findByDocCID(docCID);
        if (Objects.isNull(doc)) return null;
        return modelMapper.map(doc,DocumentMetadataDTO.class);
    }
    @GetMapping(value = "/user/{userId}/documents")
    public List<DocumentMetadataDTO> findByUser(@PathVariable String userId) {
        List<DocumentMetadata> documents = documentMetadataService.findByUser(userId);
        return documents.stream().map(doc -> modelMapper.map(doc,DocumentMetadataDTO.class)).toList();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public DocumentMetadataDTO saveOrUpdate(@RequestBody DocumentMetadataDTO documentMetadataDTO) {
        documentMetadataDTO.setDate(LocalDateTime.now());
        DocumentMetadata doc = documentMetadataService.saveOrUpdate(modelMapper.map(documentMetadataDTO,DocumentMetadata.class));
        return modelMapper.map(doc,DocumentMetadataDTO.class);
    }

    @DeleteMapping(value = "/{docCID}")
    public void delete(@PathVariable String docCID) {
        documentMetadataService.deleteDocumentMetadataByCID(docCID);
    }
}