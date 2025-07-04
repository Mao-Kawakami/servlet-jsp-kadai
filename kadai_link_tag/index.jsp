<%@ page contentType="text/html; charset=UTF-8" %>
<html>
	<head>
		<title>Servletからのメッセージを表示しよう｜課題</title>
	</head>
	<body>
		<%-- Servletへのリンク（GET） --%>
		<p><a href="<%= request.getContextPath() %>/link?name=侍太郎">名前「侍太郎」をServletに送信</a></p>
		<%-- Servletからの受信内容 --%>
		<%
			String name = (String) request.getAttribute("name");
			if (name != null) {
				out.println("Servletからデータを受信しました：" + name + "さん、こんにちは！");
			}
		%>
	</body>
</html>