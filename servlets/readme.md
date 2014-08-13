
LoginFilter.java is a filter which intercepts the request from view(index.html) before calling Login.java(servlet).
The LoginFilter.java contains a condition which either redirects to error.jsp on inputting wrong credential or calls Login.java which subsequently redirects to
success.jsp.
