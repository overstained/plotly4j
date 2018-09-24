function plotConfig(config) {
	console.log(config);
	TESTER = document.getElementById('plot-area');
	if(TESTER) {
		Plotly.plot( TESTER, JSON.parse(config));
	}
}