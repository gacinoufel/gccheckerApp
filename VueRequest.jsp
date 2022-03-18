<%@page import="web.Modeler"   %> 

<% Modeler mod=(Modeler)request.getAttribute("mod") ; %>

<!DOCTYPE html>

                        <html> 
                            <head>
                                <meta charset='utf-8'>
                                <meta name='viewport' content='width=device-width, initial-scale=1'>
                                <title>Espace Etudiant</title>
								<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/styl.css">
                                <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/styleBtn.css"> 
                                <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/inputFile.css"> 
                                <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'>
                                <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
                                <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,400;0,500;0,600;0,900;1,700;1,800;1,900&display=swap" rel="stylesheet">
                                 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.3.1/css/all.min.css">
                                <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
                                </head>
                                <body  > 
                                <div class="container"> 
                                    <form action="controleur.php" method="POST" enctype="multipart/form-data">

    <div class="card">                                                              
    
        <div class="form">
            <div class="left-side">
                <ul class="progres_bar">
                    <li>Les Objectifs</li>
                    <li>Les Acteurs</li>
                    <li>BPMN et MFC</li>
                    <li>Valider l'analyse</li>
                </ul>
            </div>
            <div class="right-side ">
                <div class="main active">
                    <div class="manage">
                        <h3>GC CHECKER</h3>
                        <p>Saisissez vos objectifs tactiques et strategiques</p>
                    </div>
                    <div class="input_div">
                        <div class="input_text"><p style="color:green;">Objectifs Tactiques </p> <textarea placeholder="Développer une application..." name="objTac" ></textarea> </div>
                        <div class="input_text"> <p style="color:green;">Objectifs Stratégiques </p><textarea placeholder="Ajouter des utilisateurs,Créer des acteurs...(Obj1,Obj2,....)" name="objStr"></textarea> </div>
                           
                    </div>
                    <div class="input_div">
                         <i class="fa fa-eye-slash password_eye"></i> 
                        <i class="fa fa-eye-slash con_eye"></i>
                    </div>
                    <div class="agree"> <span><i class="fa fa-check"></i></span>
                        
                    </div>
                   <div class="button step_1"> <a style="color:green; font-size: large; " class="next_btn"><b>Suivant</b></a> </div> 
                </div>
                <div class="main">
                    <div class="manage">
                        <h3>Saisissez vos objectifs tactiques et strategiques</h3>
                        <p></p>
                    </div>
                    
                    <div class="input_div">
                        <div class="input_text"> <textarea placeholder="Une description générale de votre analyse..."></textarea> </div>
                    </div>
                    <div class="input_div">
                        <div class="input_text"> <p style="color:green;">Acteurs</p><textarea placeholder="Ex: Acteur1,acteur2,acteur3..." name="actExt"></textarea> </div>
                         </div>
                    <div class="button step_2 m_top"> <a style="color: red; font-size: large;" class="prev_btn"><b>Retour</b></a> <a style="color:green; font-size: large;" class="next_btn"><b>Suivant</b></a> </div>
                </div>
                <div class="main ">
                    <div class="manage">
                        <h3>BPMN et MFC</h3>
                        <p>Inserez vos fichiers dans le bon endroit</p>
                    </div>
                    <div class="input_div"> 
                    <!-- Input BPMN File --> 
                            <b>BPMN : </b> <br> 
                            <div class="upload-btn-wrapper">
                                <button class="btn upload-file font-weight-500">
                                    <span class="upload-btn">
                                      <i class="fas fa-cloud-upload-alt d-block font-50 pb-2"></i> 
                                      Insérez votre fichier BPMN </span>
                                    <span class="upload-select-button" id="blankFile">
                                        Supports XML,XMI,BPMN,TXT,HTML
                                    </span>
                                    <span class="success">
                                      <i class="far fa-check-circle text-success"></i>
                                    </span>
                                </button>
                                <input type="file" name="bpmnFile" id="selectfile">
                            </div>                    
        </div> 
                    <div class="input_div"> 
                    <b>MFC : </b> <br> 
                        <div class="upload-btn-wrapper">
                        <button class="btn upload-file font-weight-500">
                        <span class="upload-btn">
                        <i class="fas fa-cloud-upload-alt d-block font-50 pb-2"></i> 
                        Insérez votre fichier MFC </span>
                        <span class="upload-select-button" id="blankFile">
                        Supports XML,XMI,BPMN,TXT,HTML
                        </span>
                        <span class="success">
                         <i class="far fa-check-circle text-success"></i>
                        </span>
                        </button>
                        <input type="file" name="mfcFile" id="selectfile">
                    </div> 
                    </div>
                    
                    <div class="button step_2 step_3"> <a style="color: red; font-size: large;" class="prev_btn"><b>Retour</b></a> <a style="color:green; font-size: large;" class="next_btn" ><b>Suivant</b></a> </div>
                </div>
                <div class="main ">
                    <div class="manage">
                        <h3>Validation d'analyse</h3>
                        <p>Merci de vérifier l'ensemble de vos saisies avant de valider votre analyse . </p>
                    </div>
                    

                    <div class="agree_submit"> <span><i class="fa fa-check"></i></span>
                        <p>J'ai bien verifier mes saisies et je valide mon analyse.</p>
                    </div>
                    <div class="button step_2 step_4"> <a style="color:red; font-size: large;" class="prev_btn"><b>Retour</b></a> 
                    <input class="btnGreen2"  type ="submit" value="Analyser" > </div>
                </div>                 <a  href="https://etudiant.gccheker.fr/" class="btnRed" >Revenir sur mon espace </a>
                
                
            </div> 
        </div>
    </div></form>
    
</div>
                                <script type='text/Javascript' src="<%=request.getContextPath() %>/js/inputFile.js"> </script>
                            
                                <script type='text/Javascript' src="<%=request.getContextPath() %>/js/scrip.js"> </script>
                                
                                </body>
                            </html>
