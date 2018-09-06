<%@page import="java.util.*"%>
<%@page import="br.pro.jose.*" %>

<% List<PosicaoBean> lista_posicao = (List<PosicaoBean>)request.getAttribute("lista_posicao"); %>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>AdminLTE 3 | Dashboard</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="dist/css/adminlte.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="plugins/iCheck/flat/blue.css">
        <!-- Morris chart -->
        <link rel="stylesheet" href="plugins/morris/morris.css">
        <!-- jvectormap -->
        <link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
        <!-- Date Picker -->
        <link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
        <!-- Daterange picker -->
        <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker-bs3.css">
        <!-- bootstrap wysihtml5 - text editor -->
        <link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
        <!-- Google Font: Source Sans Pro -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
        <style>
            .row-clicked {
                background-color: #DCDCDC;
            }
        </style>

        <script type="text/javascript">
            function changeBgColor(element) {
                if(element.className === 'row-clicked') {
                    element.className = '';
                } else {
                    element.className = 'row-clicked';
                }
            }
        </script>

    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">

            <!-- Navbar -->
            <nav class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
                <!-- Left navbar links -->
                <%@include  file="pages/menuSuperior.html" %>
            </nav>
            <!-- /.navbar -->

            <!-- Main Sidebar Container -->
            <aside class="main-sidebar sidebar-dark-primary elevation-4">
                <!-- Brand Logo -->
                <%@include  file="pages/menuLateral.html" %>
                
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <section  class="content">
                    <div class="container-fluid">
                        <!-- Small boxes (Stat box) -->
                        <div class="row">
                            <div class="col-2">
                            </div>
                            <div  class="card card-primary">
                                <div class="card-header">
                                    <h3 class="card-title">Cadastro Planos de Mensalidade</h3>
                                </div>
                                <!-- /.card-header -->
                                <!-- form start -->
                                <form action="servlet" method="POST">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-3">
                                                <label>Código:</label>
                                                <input class="form-control" name="codigo" type="text" id="codigo" placeholder="Código">
                                            </div>
                                            <div class="col-8">
                                                <label>Descrição:</label>                                         
                                                <input class="form-control" name="descricao" type="text" id="descricao" placeholder="Descrição" >
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.card-body -->
                                    <div class="card-footer">
                                        <input type="hidden" name="ope" value="gravar_posicao">    
                                        <button type="submit" class="btn btn-info">Salvar</button>
                                        <input  type="button" class="btn btn-default float-right" value="Cancelar"/>
                                    </div>
                                </form>
                            </div>
                            <!-- /.row -->
                            <!-- Main row -->

                            <!-- /.row (main row) -->
                        </div><!-- /.container-fluid -->
                        <div class="row">
                            <div class="col-2">
                            </div>
                            <div class="card card-primary">
                                <div class="card-header">
                                    <h3 class="card-title">Consulta</h3>
                                </div>
                                <!-- /.card-header -->
                                <!-- form start -->
                                <form action="servlet" method="POST">
                                    <div class="card-body">
                                        <div class="row">
                                            <div class="col-3">
                                                <label>Código:</label>
                                                <input  class="form-control" name="codigo_consulta" id="codigo_consulta" placeholder="Código" >
                                            </div>
                                            <div class="col-9">
                                                <label>Descrição:</label>
                                                <input class="form-control" name="descricao_consulta" id="descricao_consulta" placeholder="Descrição">
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-9">
                                            </div>
                                            <div class="col-3">
                                                <input type="button" class="btn btn-block btn-primary" value="Buscar" 
                                                       onclick="javascript:document.location='servlet?ope=listar_posicao';"/>                                         
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="card-body">
                                                <table id="example2" class="table table-bordered table-hover">
                                                    <thead>
                                                        <tr>
                                                            <th>Código</th>
                                                            <th>Descrição</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        
                                                        <%
                                                            for (int i = 0; i < lista_posicao.size(); i++) {
                                                                PosicaoBean p = (PosicaoBean)lista_posicao.get(i);
                                                                out.println("<tr onclick='changeBgColor(this);' ><td>" + p.getCodigo()+"</td><td>"+ p.getDescricao()+"</td></tr>");
                                                            }
                                                        %>
                                                        
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-3">
                                                <button type="button" class="btn btn-block btn-warning">Editar</button>
                                            </div>
                                            <div class="col-6">
                                            </div>
                                            <div class="col-3">
                                                <button type="button" class="btn btn-block btn-danger ">Excluir</button>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                                <!-- /.card-body -->
                            </div>
                            <!-- /.row -->
                            <!-- Main row -->

                            <!-- /.row (main row) -->
                        </div><!-- /.container-fluid -->
                </section>
            </div>
            <!-- /.content-wrapper -->
            <footer class="main-footer">
                <%@include  file="pages/footer.html" %>
            </footer>

            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <!-- /.control-sidebar -->
        </div>
        <!-- ./wrapper -->

        <!-- jQuery -->
        <script src="plugins/jquery/jquery.min.js"></script>
        <!-- jQuery UI 1.11.4 -->
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
        <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
        <script>
            $.widget.bridge('uibutton', $.ui.button)
        </script>
        <!-- Bootstrap 4 -->
        <script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Morris.js charts -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
        <script src="plugins/morris/morris.min.js"></script>
        <!-- Sparkline -->
        <script src="plugins/sparkline/jquery.sparkline.min.js"></script>
        <!-- jvectormap -->
        <script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
        <script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
        <!-- jQuery Knob Chart -->
        <script src="plugins/knob/jquery.knob.js"></script>
        <!-- daterangepicker -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
        <script src="plugins/daterangepicker/daterangepicker.js"></script>
        <!-- datepicker -->
        <script src="plugins/datepicker/bootstrap-datepicker.js"></script>
        <!-- Bootstrap WYSIHTML5 -->
        <script src="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
        <!-- Slimscroll -->
        <script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
        <!-- FastClick -->
        <script src="plugins/fastclick/fastclick.js"></script>
        <!-- AdminLTE App -->
        <script src="dist/js/adminlte.js"></script>
        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
        <script src="dist/js/pages/dashboard.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="dist/js/demo.js"></script>
    </body>
</html>
