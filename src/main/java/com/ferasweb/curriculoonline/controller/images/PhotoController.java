/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.controller.images;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.imageio.stream.FileImageOutputStream;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletContext;
import org.primefaces.event.CaptureEvent;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.CroppedImage;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author benignoms
 */
@Named
@ViewScoped
public class PhotoController implements Serializable{

    private CroppedImage imagemRecortada;
    private String foto;
    private String fotoRecortada;
    private String arquivoFoto;
    private String arquivoFotoRecortada;
    private boolean exibeImagemCapturada;
    private ServletContext servletContext;
    @Inject
    private ExternalContext externalContext;
    private UploadedFile file;
    private byte[] img;
    private boolean controlButtonSave;

    public String getArquivoFoto() {
        return arquivoFoto;
    }

    public void setArquivoFoto(String arquivoFoto) {
        this.arquivoFoto = arquivoFoto;
    }

    public String getArquivoFotoRecortada() {
        return arquivoFotoRecortada;
    }

    public void setArquivoFotoRecortada(String arquivoFotoRecortada) {
        this.arquivoFotoRecortada = arquivoFotoRecortada;
    }

    public boolean isExibeImagemCapturada() {
        return exibeImagemCapturada;
    }

    public void setExibeImagemCapturada(boolean exibeImagemCapturada) {
        this.exibeImagemCapturada = exibeImagemCapturada;
    }

    public String getFotoRecortada() {
        return fotoRecortada;
    }

    public void setFotoRecortada(String fotoRecortada) {
        this.fotoRecortada = fotoRecortada;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public CroppedImage getImagemRecortada() {
        return imagemRecortada;
    }

    public void setImagemRecortada(CroppedImage imagemRecortada) {
        this.imagemRecortada = imagemRecortada;
    }

    private String getNumeroRandomico() {
        int i = (int) (Math.random() * 10000);
        return String.valueOf(i);
    }

    public boolean isControlButtonSave() {
        return controlButtonSave;
    }

    public void setControlButtonSave(boolean controlButtonSave) {
        this.controlButtonSave = controlButtonSave;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    public String getRealPath() {
        String path = externalContext.getRealPath("/resources/images/tmp/" + foto + ".jpeg");
        return path;
    }

    private void criaArquivo(String arquivo, byte[] dados) throws IOException {
        FileImageOutputStream imageOutput;
      
        imageOutput = new FileImageOutputStream(new File(arquivo));
        imageOutput.write(dados, 0, dados.length);
        imageOutput.close();
        img = dados;
    }

    public void recortar() {
        verificaExistenciaArquivo(arquivoFotoRecortada);
        fotoRecortada = "fotoRecortada" + getNumeroRandomico() + ".png";

        arquivoFotoRecortada = externalContext.getRealPath("") + File.separator + "resources"
                + File.separator + "images" + File.separator + "tmp" + File.separator + fotoRecortada;
        try {
            criaArquivo(arquivoFotoRecortada, imagemRecortada.getBytes());
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Foto RECORTADA com sucesso!", "Informação"));
            controlButtonSave = true;
        } catch (IOException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), "Error"));
        }
    }

    public void oncapture(CaptureEvent captureEvent) {
        controlButtonSave = false;
        verificaExistenciaArquivo(arquivoFoto);
        foto = "foto" + getNumeroRandomico() + ".png";
        arquivoFoto = externalContext.getRealPath("") + File.separator + "resources"
                + File.separator + "images" + File.separator + "tmp" + File.separator + foto;
        try {
            criaArquivo(arquivoFoto, captureEvent.getData());
            exibeImagemCapturada = true;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Foto CAPTURADA com sucesso!", "Informação"));
        } catch (IOException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), "Error"));
        }
    }

    public void uploadImagem(FileUploadEvent event) {
        controlButtonSave = false;
        verificaExistenciaArquivo(arquivoFoto);
        foto = event.getFile().getFileName();
        arquivoFoto = externalContext.getRealPath("") + File.separator + "resources"
                + File.separator + "images" + File.separator + "tmp" + File.separator + foto;
        try {
            criaArquivo(arquivoFoto, event.getFile().getContents());
            exibeImagemCapturada = true;
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Foto Adcionada com sucesso!", "Informação"));
        } catch (IOException ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, ex.getMessage(), "Error"));
        }

    }

    private void verificaExistenciaArquivo(String arquivo) {
        if (arquivo != null) {
            File file = new File(arquivo);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public PhotoController() {
        exibeImagemCapturada = false;
    }
}
