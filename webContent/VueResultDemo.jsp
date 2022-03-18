<%@page import="web.Modeler"   %> 

<% Modeler mod=(Modeler)request.getAttribute("mod") ; %>

<!DOCTYPE html>

                        <html>
                            <head>
                                <meta charset='utf-8'>
                                <meta name='viewport' content='width=device-width, initial-scale=1'>
                                <title>Espace Etudiant</title>
								<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/styl.css">
                                <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet'>
                                <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
                                <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/styleBtn.css"> 
                               <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/styleBtnDemo.css"> 
                                
                                </head>


                                <body oncontextmenu='return false' class='snippet-body'> 
                                <div class="container"> 
                                    <form action="controleur.php" method="POST" enctype="multipart/form-data">

    <div class="card">
        <div class="form">
            <div class="left-side">
                <ul class="progres_bar">
                   <a href="<%=request.getContextPath() %>/controleur" > <li style="btnGreen">Retour en arriere </li> </a>
                   
                </ul>
            </div>
            <div class="right-side ">
                <div class="main active">
                    
                    
                    <div class="h4_txt">
                        <h4>Resultat :  </h4> 
                    </div>    
                         <center> <%=mod.getAnalyseResultat() %>  
                         <p>Merci pour votre confiance</p>
                      <a  href="<%=request.getContextPath() %>/controleur" class="btnBlue2" >Re-essayez une autre fois </a>
                                                <a  href="https://www.authpro.com/auth/Authgcchecker/?action=reg" class="btnGreen2" >Bénificier de la version PRO</a>
                          </center> 
                </div> 
                <br>
               <center> <h4>Pour toutes questions, nous vous invitons a regarder nos <a href="https.gccheker.fr:faq/"><b>FAQ</b></a> ou de nous contacter directement via le chat live</h4></center>
                
                
            </div>
        </div>
    </div>
</div>
</form>
                            
                                <script type='text/Javascript' src="<%=request.getContextPath() %>/js/scrip.js"> </script>
                                </body>
</html>