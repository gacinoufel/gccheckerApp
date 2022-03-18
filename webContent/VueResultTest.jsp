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
                                <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/styleTab.css"> 
                                
                                </head>


                                <body > 
                                

    <div class="card">
        <div class="form">
           
           
              
                    
                    <center>
                        <br>
                          <%=mod.getAnalyseResultat() %>  
                         <p>Merci pour votre confiance</p>
                      <a  href="<%=request.getContextPath() %>/controleur" class="btnGreen2" >Re-essayez une autre fois </a>
                                                <a  href="https://etudiant.gccheker.fr/" class="btnRed" >Revenir sur mon espace </a>
              
                
                
           
        </div>
    </div>

                            
                                <script type='text/Javascript' src="<%=request.getContextPath() %>/js/scrip.js"> </script>
                                </body>
</html>