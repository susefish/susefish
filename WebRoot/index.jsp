<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<meta property="qc:admins" content="34223725276353561306375" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-responsive.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.9.1.js" type="text/javascript"></script>
<script src="js/bootstrap.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
<script type="text/javascript">
$(document).ready(
	function(){
		$('.carousel').carousel({
  			interval: 2000
		});
		$('.carousel').bind("slid",function(){
			var active = $(this).find(".active");
			var  children = active.parent().children();
            var activePos = children.index(active);
			var prevTag = $(".badge-info");
			prevTag.removeClass("badge-info");
			prevTag.addClass("badge-inverse");
			var nowTag = $("#tag li:eq("+activePos+") span");
			nowTag.removeClass("badge-inverse");
			nowTag.addClass("badge-info");
		});
		$("#myCarousel li").each(
				function(index,element){
					$(this).bind("click",
						function(){
							$('.carousel').carousel(index);
						}
					);
				}
		);
	}
);

</script>
<title>SUSEfish</title>
<style type="text/css">
      body {
        padding-top: 20px;
        padding-bottom: 60px;
      }
		input:focus{outline:none;}
      /* Custom container */
      .container {
        margin: 0 auto;
        max-width: 1000px;
      }
      .container > hr {
        margin: 60px 0;
      }

      /* Main marketing message and sign up button */
      .jumbotron {
        margin: 80px 0;
        text-align: center;
      }
      .jumbotron h1 {
        font-size: 100px;
        line-height: 1;
      }
      .jumbotron .lead {
        font-size: 24px;
        line-height: 1.25;
      }
      .jumbotron .btn {
        font-size: 21px;
        padding: 14px 24px;
      }

      /* Supporting marketing content */
      .marketing {
        margin: 60px 0;
      }
      .marketing p + h4 {
        margin-top: 28px;
      }


      /* Customize the navbar links to be fill the entire space of the .navbar */
      .navbar .navbar-inner {
        padding: 0;
      }
      .navbar .nav {
        margin: 0;
        display: table;
        width: 100%;
      }
      .navbar .nav li {
        display: table-cell;
        width: 1%;
        float: none;
      }
      .navbar .nav li a {
        font-weight: bold;
        text-align: center;
        border-left: 1px solid rgba(255,255,255,.75);
        border-right: 1px solid rgba(0,0,0,.1);
      }
      .navbar .nav li:first-child a {
        border-left: 0;
        border-radius: 3px 0 0 3px;
      }
      .navbar .nav li:last-child a {
        border-right: 0;
        border-radius: 0 3px 3px 0;
      }
	  #myCarousel ul {
		position:absolute;
	    list-style-type:none;
	    opacity:0.8; 
	    z-index:1002;
		bottom:0px;
		right:5px;
	  }
      #myCarousel ul li { 
	    padding:0px 3px;
        float:left;
        display:block;
        cursor:pointer
	  }
      #myCarousel ul li.on { 
	    background:#900
	  }
	  .phead{
		padding-left:10px;
	    vertical-align:middle;
	    line-height:28px;
	    display:block;
		filter: progid:DXImageTransform.Microsoft.gradient(startcolorstr=#FFFFFF,endcolorstr=#E4E4E4,gradientType=0);
	    background:-moz-linear-gradient(top, #FFFFFF, #E4E4E4);
	    background:-webkit-gradient(linear, 0 0, 0 bottom, from(#FFFFFF), to(#E4E4E4));
	  }
	  .ptitle{
	  	font-size:14px;
	  }
	  .cont{
	  	border-color:#CCCCCC;
		border-width:1px;
		border-style:solid;
	  }
	  .recommend{
	  	margin-left:10px;
		line-height:40px;
		color:#035EB7;
	  }
 </style>   
</head>

<body>
<div class="container">
  <div class="masthead">
      <div>
          <img src="./img/logo.jpg" class="img-rounded">
      </div>
      <div class="navbar">
          <div class="navbar-inner">
              <div class ="container">
                  <ul class="nav">
                    <li class="active"><a href="#">��ҳ</a></li>
                    <li><a href="#">����</a></li>
                    <li><a href="#">�Ŀ�</a></li>
                    <li><a href="#">�Ķ�</a></li>
                    <li><a href="#">T̨</a></li>
                    <li><a href="#">��̳</a></li>
                  </ul>
               </div>
          </div>
      </div>
  </div>
  <div class="container-fluid">
  
      <div class="row-fluid">
      
          <div class="span4" style="padding:10px">
          
            <!--Sidebar content-->
                <div id="myCarousel" class="carousel">
                    <div class="carousel-inner">  
                       <div class="active item"><a href="#"><img src="./img/hd1.jpg"  /></a></div>
                       <div class="item"><a href="#"><img src="./img/hd2.jpg"  /></a></div> 
                       <div class="item"><a href="#"><img src="./img/hd3.jpg"  /></a></div>
                    </div>
                    <ul id="tag">
                        <li><span class="badge badge-info">1</span></li>
                        <li><span class="badge badge-inverse">2</span></li>
                        <li><span class="badge badge-inverse">3</span></li>
                   </ul>
                </div>
                <form>
                	<fieldset>    
                		<input type="text" class="input-medium search-query" placeholder="Search" > 
                        <button class="btn btn-primary" type="button">վ������</button>
                    </fieldset> 
                </form>
                <ul class="unstyled" style="color:#666666">
                	<li><span class="muted">��Ӱ���̵�2010ʮ������ֲ���Ӱ</span></li>
                    <li><span class="muted">��Ӱ���Ҷԡ�ʮ���������</span></li>
                    <li><span class="muted">DWR֮���ʵ��Ӧ��</span></li>
                    <li><span class="muted">������һ��仯֮һһ��Ǩ</span></li>
                    <li><span class="muted">��Ӱ���̵�2010ʮ������ֲ���Ӱ</span></li>
                    <li><span class="muted">��Ӱ���Ҷԡ�ʮ���������</span></li>
                    <li><span class="muted">DWR֮���ʵ��Ӧ��</span></li>
                    <li><span class="muted">������һ��仯֮һһ��Ǩ</span></li>
                    <li><span class="muted">��Ӱ���̵�2010ʮ������ֲ���Ӱ</span></li>
                    <li><span class="muted">��Ӱ���Ҷԡ�ʮ���������</span></li>
                    <li><span class="muted">DWR֮���ʵ��Ӧ��</span></li>
                    <li><span class="muted">������һ��仯֮һһ��Ǩ</span></li>
                </ul>    	   
           </div>
           <div class="">
            		<!--Body content-->
					<table>
					<tr><td>
					<table width="488" cellpadding="10">
                      <tr>
                          <td>
                              <a href="#" class="thumbnail">
                                      <img src="img/img5.jpg" alt="" width="310" height="232">
                            </a>
                          </td>
                          <td>
                              <a href="#" class="thumbnail">
                                      <img src="img/img5.jpg" alt="">
                            </a>
                          </td>
                      </tr>
                    <tr>
                          <td>
                              <a href="#" class="thumbnail">
                                      <img src="img/img5.jpg" alt="" width="310" height="232">
                            </a>
                          </td>
                          <td>
                              <a href="#" class="thumbnail">
                                      <img src="img/img5.jpg" alt="">
                            </a>
                          </td>
                      </tr>
                   </table>
					</td></tr>
					<tr><td>
					<div class="container-fluid">
                 	<div class="row-fluid">
                    	<div class=" cont">
                        	<div class="phead">
    								<Strong class="ptitle">��Ѷ</strong>
                                    <div style="font-size:12px;display:inline-block">&nbsp;&nbsp;&nbsp;�������������						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��н10-20��Ƹ.net��ʦ</div>
							</div>
                            <div class="recommend"><strong>��ý������΢��12��������</strong></div>
                            <ul>
                            	<li>ipad2�Ѿ�Ͷ������  4�³�����</li>
                                <li>�ڿ�������Ѷ�������ƴ�������©��</li>
                                <li>ʮ�󶥼�ְҵ���ͺ����ǵĳɹ�֮��</li>
                                <li>Channel--̽�������������������˲�</li>
                                <li>�����Bing�����ݶ�����12.8%�ȸ��»���68%</li>
                                <li>΢���׹ر�Windowsϵͳ��AutoRun����</li>
                                <li>Windows������˽©����в9��IE�û�</li>
                            </ul>
                        </div>
                    </div>
                    <div class="row-fluid">
                    	<div class=" cont">
                        	<div class="phead">
                            	<Strong class="ptitle">�ƶ�</strong>                 
                            </div>
                            <div class="recommend"><strong>NOKIE CEO�ڲ�����¼�ع⣺�¾��������Ż�ƽ̨</strong></div>
                            <ul>
                            	<li>VeriZon Phone 4���ͼ���� ֧��GSM/CDMA˫��ʽ</li>
                                <li>ŵ�������彫���ٴ󿼣�������Android</li>
                                <li>Android2.4�����Ƴ���������Ϊ����</li>
                                <li>McAfee:2010���ֻ���ȫ��в����</li>
                                <li>������ר�⡿Windows Phone 7��Ʒ�̳�</li>
                                <li>΢���׹ر�Windowsϵͳ��AutoRun����</li>
                                <li>Windows������˽©����в9��IE�û�</li>
                            </ul>
                        </div>
                    </div>
                 </div>
					</td></tr>
					<table>	 
           </div>
      </div>
  </div> 
  
</div>

</body>
</html>