package metier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainATester {

	public static void main(String[] args) { 
		String xmlmfc="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
				+ "<mxfile host=\"app.diagrams.net\" modified=\"2022-03-06T17:40:39.290Z\" agent=\"5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/97.0.4692.71 Safari/537.36\" etag=\"IBBA3JNx5AA0y317cPgB\" version=\"16.6.6\" type=\"device\">\n"
				+ "  <diagram id=\"yaR8N0y67tRqn7zQOQpr\" name=\"Page-1\">\n"
				+ "    <mxGraphModel dx=\"1351\" dy=\"707\" grid=\"1\" gridSize=\"10\" guides=\"1\" tooltips=\"1\" connect=\"1\" arrows=\"1\" fold=\"1\" page=\"1\" pageScale=\"1\" pageWidth=\"827\" pageHeight=\"1169\" math=\"0\" shadow=\"0\">\n"
				+ "      <root>\n"
				+ "        <mxCell id=\"0\" />\n"
				+ "        <mxCell id=\"1\" parent=\"0\" />\n"
				+ "        <mxCell id=\"wItf2btd2XwO8WPsTBu5-1\" value=\"\" style=\"whiteSpace=wrap;html=1;aspect=fixed;\" vertex=\"1\" parent=\"1\">\n"
				+ "          <mxGeometry x=\"50\" y=\"150\" width=\"220\" height=\"220\" as=\"geometry\" />\n"
				+ "        </mxCell>\n"
				+ "        <mxCell id=\"wItf2btd2XwO8WPsTBu5-3\" value=\"user1\" style=\"ellipse;whiteSpace=wrap;html=1;\" vertex=\"1\" parent=\"1\">\n"
				+ "          <mxGeometry x=\"400\" y=\"150\" width=\"120\" height=\"80\" as=\"geometry\" />\n"
				+ "        </mxCell>\n"
				+ "        <mxCell id=\"wItf2btd2XwO8WPsTBu5-4\" value=\"user2\" style=\"ellipse;whiteSpace=wrap;html=1;\" vertex=\"1\" parent=\"1\">\n"
				+ "          <mxGeometry x=\"420\" y=\"260\" width=\"120\" height=\"80\" as=\"geometry\" />\n"
				+ "        </mxCell>\n"
				+ "        <mxCell id=\"wItf2btd2XwO8WPsTBu5-7\" value=\"\" style=\"endArrow=classic;html=1;rounded=0;entryX=1;entryY=0.5;entryDx=0;entryDy=0;exitX=0;exitY=0.5;exitDx=0;exitDy=0;\" edge=\"1\" parent=\"1\" source=\"wItf2btd2XwO8WPsTBu5-3\" target=\"wItf2btd2XwO8WPsTBu5-1\">\n"
				+ "          <mxGeometry width=\"50\" height=\"50\" relative=\"1\" as=\"geometry\">\n"
				+ "            <mxPoint x=\"560\" y=\"450\" as=\"sourcePoint\" />\n"
				+ "            <mxPoint x=\"610\" y=\"400\" as=\"targetPoint\" />\n"
				+ "          </mxGeometry>\n"
				+ "        </mxCell>\n"
				+ "        <mxCell id=\"wItf2btd2XwO8WPsTBu5-9\" value=\"F01: Facture\" style=\"edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];\" vertex=\"1\" connectable=\"0\" parent=\"wItf2btd2XwO8WPsTBu5-7\">\n"
				+ "          <mxGeometry x=\"0.1817\" relative=\"1\" as=\"geometry\">\n"
				+ "            <mxPoint as=\"offset\" />\n"
				+ "          </mxGeometry>\n"
				+ "        </mxCell>\n"
				+ "        <mxCell id=\"wItf2btd2XwO8WPsTBu5-8\" value=\"\" style=\"endArrow=classic;html=1;rounded=0;exitX=0.991;exitY=0.668;exitDx=0;exitDy=0;exitPerimeter=0;\" edge=\"1\" parent=\"1\" source=\"wItf2btd2XwO8WPsTBu5-1\" target=\"wItf2btd2XwO8WPsTBu5-4\">\n"
				+ "          <mxGeometry width=\"50\" height=\"50\" relative=\"1\" as=\"geometry\">\n"
				+ "            <mxPoint x=\"560\" y=\"450\" as=\"sourcePoint\" />\n"
				+ "            <mxPoint x=\"610\" y=\"400\" as=\"targetPoint\" />\n"
				+ "          </mxGeometry>\n"
				+ "        </mxCell>\n"
				+ "        <mxCell id=\"wItf2btd2XwO8WPsTBu5-10\" value=\"F02 : Recu\" style=\"edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];\" vertex=\"1\" connectable=\"0\" parent=\"wItf2btd2XwO8WPsTBu5-8\">\n"
				+ "          <mxGeometry x=\"-0.2343\" y=\"-3\" relative=\"1\" as=\"geometry\">\n"
				+ "            <mxPoint as=\"offset\" />\n"
				+ "          </mxGeometry>\n"
				+ "        </mxCell>\n"
				+ "        <mxCell id=\"wItf2btd2XwO8WPsTBu5-11\" value=\"Activite001\" style=\"rounded=1;whiteSpace=wrap;html=1;\" vertex=\"1\" parent=\"1\">\n"
				+ "          <mxGeometry x=\"100\" y=\"200\" width=\"120\" height=\"60\" as=\"geometry\" />\n"
				+ "        </mxCell>\n"
				+ "      </root>\n"
				+ "    </mxGraphModel>\n"
				+ "  </diagram>\n"
				+ "</mxfile>" ;  
		
		
		
		String xmlbpmn= "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
				+ "<bpmn2:tDefinitions xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:bpmn2=\"http://www.omg.org/spec/BPMN/20100524/MODEL-XMI\" xmi:id=\"_wSbnUJipEeywH4imXz37fQ\" name=\"bpmnTT\" targetNamespace=\"http://genmymodel.com/bpmn2\">\n"
				+ "  <eAnnotations xmi:id=\"_wSbnUJipEeywH4imXz37fQ0\" source=\"genmymodel\">\n"
				+ "    <details xmi:id=\"_wSbnUJipEeywH4imXz37fQ00\" key=\"uuid\" value=\"_wSbnUJipEeywH4imXz37fQ\"/>\n"
				+ "    <details xmi:id=\"_wSbnUJipEeywH4imXz37fQ01\" key=\"author\" value=\"gccheker\"/>\n"
				+ "  </eAnnotations>\n"
				+ "  <bpmn2:rootElement xsi:type=\"bpmn2:tCollaboration\" xmi:id=\"_u6npEHrXEDqTsv_oMt1zow\" isClosed=\"true\">\n"
				+ "    <eAnnotations xmi:id=\"_u6npEHrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "      <details xmi:id=\"_u6npEHrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_u6npEHrXEDqTsv_oMt1zow\"/>\n"
				+ "    </eAnnotations>\n"
				+ "    <bpmn2:participant xmi:id=\"_u6zPQHrXEDqTsv_oMt1zow\" name=\"user1\" processRef=\"_wSbnUJipEeywH4imXz37fQ.xmi#_u6vk4HrXEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_u6zPQHrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_u6zPQHrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_u6zPQHrXEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:participant>\n"
				+ "    <bpmn2:participant xmi:id=\"_yJuCUHrXEDqTsv_oMt1zow\" name=\"user2\" processRef=\"_wSbnUJipEeywH4imXz37fQ.xmi#_yJuCUXrXEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_yJuCUHrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_yJuCUHrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_yJuCUHrXEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:participant>\n"
				+ "    <bpmn2:messageFlow xmi:id=\"_8Brl8HrXEDqTsv_oMt1zow\" name=\"F01: Facture\" sourceRef=\"_wSbnUJipEeywH4imXz37fQ.xmi#_33bMAHrXEDqTsv_oMt1zow\" targetRef=\"_wSbnUJipEeywH4imXz37fQ.xmi#_4w_RQHrXEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_8Brl8HrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_8Brl8HrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_8Brl8HrXEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:messageFlow>\n"
				+ "    <bpmn2:messageFlow xmi:id=\"_O0YP8HrYEDqTsv_oMt1zow\" name=\"F02 : Recu\" sourceRef=\"_wSbnUJipEeywH4imXz37fQ.xmi#_F2jZUHrYEDqTsv_oMt1zow\" targetRef=\"_wSbnUJipEeywH4imXz37fQ.xmi#_HNk2oHrYEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_O0YP8HrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_O0YP8HrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_O0YP8HrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:messageFlow>\n"
				+ "  </bpmn2:rootElement>\n"
				+ "  <bpmn2:rootElement xsi:type=\"bpmn2:tProcess\" xmi:id=\"_u6vk4HrXEDqTsv_oMt1zow\" name=\"Processus\">\n"
				+ "    <eAnnotations xmi:id=\"_u6vk4HrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "      <details xmi:id=\"_u6vk4HrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_u6vk4HrXEDqTsv_oMt1zow\"/>\n"
				+ "    </eAnnotations>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tStartEvent\" xmi:id=\"_zfIWEHrXEDqTsv_oMt1zow\" name=\"Début\">\n"
				+ "      <eAnnotations xmi:id=\"_zfIWEHrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_zfIWEHrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_zfIWEHrXEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "      <bpmn2:outgoing>_AZ_qAHrYEDqTsv_oMt1zow</bpmn2:outgoing>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tIntermediateThrowEvent\" xmi:id=\"_33bMAHrXEDqTsv_oMt1zow\" name=\"\">\n"
				+ "      <eAnnotations xmi:id=\"_33bMAHrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_33bMAHrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_33bMAHrXEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "      <bpmn2:incoming>_AZ_qAHrYEDqTsv_oMt1zow</bpmn2:incoming>\n"
				+ "      <bpmn2:outgoing>_MVaTIHrYEDqTsv_oMt1zow</bpmn2:outgoing>\n"
				+ "      <bpmn2:eventDefinition xsi:type=\"bpmn2:tMessageEventDefinition\" xmi:id=\"_33caIHrXEDqTsv_oMt1zow\">\n"
				+ "        <eAnnotations xmi:id=\"_33caIHrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "          <details xmi:id=\"_33caIHrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_33caIHrXEDqTsv_oMt1zow\"/>\n"
				+ "        </eAnnotations>\n"
				+ "      </bpmn2:eventDefinition>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tSequenceFlow\" xmi:id=\"_AZ_qAHrYEDqTsv_oMt1zow\" sourceRef=\"_zfIWEHrXEDqTsv_oMt1zow\" targetRef=\"_33bMAHrXEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_AZ_qAHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_AZ_qAHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_AZ_qAHrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tEndEvent\" xmi:id=\"_CO6kQHrYEDqTsv_oMt1zow\" name=\"Fin\">\n"
				+ "      <eAnnotations xmi:id=\"_CO6kQHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_CO6kQHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_CO6kQHrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "      <bpmn2:incoming>_M5jiAHrYEDqTsv_oMt1zow</bpmn2:incoming>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tIntermediateCatchEvent\" xmi:id=\"_HNk2oHrYEDqTsv_oMt1zow\" name=\"\">\n"
				+ "      <eAnnotations xmi:id=\"_HNk2oHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_HNk2oHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_HNk2oHrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "      <bpmn2:incoming>_MVaTIHrYEDqTsv_oMt1zow</bpmn2:incoming>\n"
				+ "      <bpmn2:outgoing>_M5jiAHrYEDqTsv_oMt1zow</bpmn2:outgoing>\n"
				+ "      <bpmn2:eventDefinition xsi:type=\"bpmn2:tMessageEventDefinition\" xmi:id=\"_HNk2oXrYEDqTsv_oMt1zow\">\n"
				+ "        <eAnnotations xmi:id=\"_HNk2oXrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "          <details xmi:id=\"_HNk2oXrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_HNk2oXrYEDqTsv_oMt1zow\"/>\n"
				+ "        </eAnnotations>\n"
				+ "      </bpmn2:eventDefinition>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tSequenceFlow\" xmi:id=\"_MVaTIHrYEDqTsv_oMt1zow\" sourceRef=\"_33bMAHrXEDqTsv_oMt1zow\" targetRef=\"_HNk2oHrYEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_MVaTIHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_MVaTIHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_MVaTIHrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tSequenceFlow\" xmi:id=\"_M5jiAHrYEDqTsv_oMt1zow\" sourceRef=\"_HNk2oHrYEDqTsv_oMt1zow\" targetRef=\"_CO6kQHrYEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_M5jiAHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_M5jiAHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_M5jiAHrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "  </bpmn2:rootElement>\n"
				+ "  <bpmn2:rootElement xsi:type=\"bpmn2:tProcess\" xmi:id=\"_yJuCUXrXEDqTsv_oMt1zow\" name=\"Processus\">\n"
				+ "    <eAnnotations xmi:id=\"_yJuCUXrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "      <details xmi:id=\"_yJuCUXrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_yJuCUXrXEDqTsv_oMt1zow\"/>\n"
				+ "    </eAnnotations>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tStartEvent\" xmi:id=\"_z5qV8HrXEDqTsv_oMt1zow\" name=\"Début\">\n"
				+ "      <eAnnotations xmi:id=\"_z5qV8HrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_z5qV8HrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_z5qV8HrXEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "      <bpmn2:outgoing>_A8D1QHrYEDqTsv_oMt1zow</bpmn2:outgoing>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tIntermediateCatchEvent\" xmi:id=\"_4w_RQHrXEDqTsv_oMt1zow\" name=\"\">\n"
				+ "      <eAnnotations xmi:id=\"_4w_RQHrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_4w_RQHrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_4w_RQHrXEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "      <bpmn2:incoming>_A8D1QHrYEDqTsv_oMt1zow</bpmn2:incoming>\n"
				+ "      <bpmn2:outgoing>_ElbvsHrYEDqTsv_oMt1zow</bpmn2:outgoing>\n"
				+ "      <bpmn2:eventDefinition xsi:type=\"bpmn2:tMessageEventDefinition\" xmi:id=\"_4w_4UHrXEDqTsv_oMt1zow\">\n"
				+ "        <eAnnotations xmi:id=\"_4w_4UHrXEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "          <details xmi:id=\"_4w_4UHrXEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_4w_4UHrXEDqTsv_oMt1zow\"/>\n"
				+ "        </eAnnotations>\n"
				+ "      </bpmn2:eventDefinition>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tSequenceFlow\" xmi:id=\"_A8D1QHrYEDqTsv_oMt1zow\" sourceRef=\"_z5qV8HrXEDqTsv_oMt1zow\" targetRef=\"_4w_RQHrXEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_A8D1QHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_A8D1QHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_A8D1QHrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tEndEvent\" xmi:id=\"_Bl2ZIHrYEDqTsv_oMt1zow\" name=\"Fin\">\n"
				+ "      <eAnnotations xmi:id=\"_Bl2ZIHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_Bl2ZIHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_Bl2ZIHrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "      <bpmn2:incoming>_F2kAYXrYEDqTsv_oMt1zow</bpmn2:incoming>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tSequenceFlow\" xmi:id=\"_ElbvsHrYEDqTsv_oMt1zow\" sourceRef=\"_4w_RQHrXEDqTsv_oMt1zow\" targetRef=\"_F2jZUHrYEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_ElbvsHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_ElbvsHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_ElbvsHrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tSequenceFlow\" xmi:id=\"_F2kAYXrYEDqTsv_oMt1zow\" sourceRef=\"_F2jZUHrYEDqTsv_oMt1zow\" targetRef=\"_Bl2ZIHrYEDqTsv_oMt1zow\">\n"
				+ "      <eAnnotations xmi:id=\"_F2kAYXrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_F2kAYXrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_F2kAYXrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "    <bpmn2:flowElement xsi:type=\"bpmn2:tIntermediateThrowEvent\" xmi:id=\"_F2jZUHrYEDqTsv_oMt1zow\" name=\"\">\n"
				+ "      <eAnnotations xmi:id=\"_F2jZUHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "        <details xmi:id=\"_F2jZUHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_F2jZUHrYEDqTsv_oMt1zow\"/>\n"
				+ "      </eAnnotations>\n"
				+ "      <bpmn2:incoming>_ElbvsHrYEDqTsv_oMt1zow</bpmn2:incoming>\n"
				+ "      <bpmn2:outgoing>_F2kAYXrYEDqTsv_oMt1zow</bpmn2:outgoing>\n"
				+ "      <bpmn2:eventDefinition xsi:type=\"bpmn2:tMessageEventDefinition\" xmi:id=\"_F2kAYHrYEDqTsv_oMt1zow\">\n"
				+ "        <eAnnotations xmi:id=\"_F2kAYHrYEDqTsv_oMt1zow0\" source=\"genmymodel\">\n"
				+ "          <details xmi:id=\"_F2kAYHrYEDqTsv_oMt1zow00\" key=\"uuid\" value=\"_F2kAYHrYEDqTsv_oMt1zow\"/>\n"
				+ "        </eAnnotations>\n"
				+ "      </bpmn2:eventDefinition>\n"
				+ "    </bpmn2:flowElement>\n"
				+ "  </bpmn2:rootElement>\n"
				+ "</bpmn2:tDefinitions>"; 
		
		
		BpmnParser bp= new BpmnParser () ; 
		MfcParser mp= new MfcParser () ; 
		bp.parseBpmnMethode(xmlbpmn) ;  
		mp.parseMfcMethode(xmlmfc) ; 
		List<String> lFluxBpmn = new ArrayList<> () ;  
		List<String> lFluxMfc = new ArrayList<> () ; 
		List<String> lActBpmn = new ArrayList<> () ;  
		List<String> lActMfc = new ArrayList<> () ;  
		
		lFluxBpmn=bp.getListFluxBpmn(); 
		lFluxMfc=mp.getListFluxMfc() ; 
		lActBpmn=bp.getListActeursBpmn(); 
		lActMfc=mp.getListActeursMfc() ; 
		System.out.println(lActBpmn) ; 
		System.out.println(lActMfc) ; 

		CompareList cpl= new CompareList() ; 
		System.out.println("meme chose communs : " + cpl.sameArrayList(lFluxBpmn, lFluxMfc))  ;
		
		//System.out.println(lFluxBpmn==lFluxMfc) ;
		Comparateur cp = new Comparateur() ; 
		System.out.println("diffirence is thiiiiis :  "+cp.diff2List(lFluxBpmn,lFluxMfc))  ; 
		
		//System.out.println(lFluxBpmn) ; 
		//System.out.println( "++++"+lFluxMfc) ; 
		
		String xx="abcd,abcd,aaaaa,bbb,ccc" ; 
		String[] l = xx.split(",") ; 
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(l));

		System.out.println(list) ;
	}

}
