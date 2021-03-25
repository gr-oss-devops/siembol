package uk.co.gresearch.siembol.configeditor.common;

import java.util.Map;

public class ConfigInfo {
    private String name;
    private Map<String, String> filesContent;
    private String commitMessage;
    private int oldVersion;
    private int version;
    private String committer;
    private String committerEmail;
    private String branchName = "master";
    private boolean shouldCleanDirectory = false;
    private ConfigInfoType configInfoType;

    public Map<String, String> getFilesContent() {
        return filesContent;
    }

    public void setFilesContent(Map<String, String> filesContent) {
        this.filesContent = filesContent;
    }

    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public int getOldVersion() {
        return oldVersion;
    }

    public void setOldVersion(int oldVersion) {
        this.oldVersion = oldVersion;
    }

    public String getCommitter() {
        return committer;
    }

    public void setCommitter(String committer) {
        this.committer = committer;
    }

    public String getCommitterEmail() {
        return committerEmail;
    }

    public void setCommitterEmail(String committerEmail) {
        this.committerEmail = committerEmail;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isNewConfig() {
        return oldVersion == 0;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public boolean shouldCleanDirectory() {
        return shouldCleanDirectory;
    }

    public void shouldCleanDirectory(boolean shouldCleanDirectory) {
        this.shouldCleanDirectory = shouldCleanDirectory;
    }

    public ConfigInfoType getConfigInfoType() {
        return configInfoType;
    }

    public void setConfigInfoType(ConfigInfoType configInfoType) {
        this.configInfoType = configInfoType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}