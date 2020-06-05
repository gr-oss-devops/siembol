package uk.co.gresearch.siembol.configeditor.service.elk;

import org.springframework.boot.actuate.health.Health;
import uk.co.gresearch.siembol.configeditor.model.ConfigEditorResult;


public interface ElkService {

    ConfigEditorResult getTemplateFields(String sensor);

    ConfigEditorResult getTemplateFields();

    ConfigEditorResult shutDown();

    ConfigEditorResult awaitShutDown();

    Health checkHealth();
}