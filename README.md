<h1 align="center" id="title">Jmeter-stress-testing-on-restAPI-and-MongoDb</h1>

<p id="description">Guide and examples how to use Apache Jmeter for stress testing on a restful API and MongoDB.</p>

<h2>🛠️ Installation Steps:</h2>

<p>1. Install Jmeter</p>
<p>https://jmeter.apache.org/download_jmeter.cgi</p>

<p>2. Install Apache perfmon plugin</p>
<p>https://jmeter-plugins.org/wiki/PerfMon/</p>

<p>3. Install Apache server agent plugin</p>
<p>https://github.com/undera/perfmon-agent/blob/master/README.md</p>
<p><strong>Important Note:</strong><p>
<p>On Windows there might be a problem communicating with the Apache Server Agent. That could be because the <strong>sigar-amd64-winnt.dll</strong> is corrupted.You can find the corrected file here<strong>'./Other_files/sigar-amd64-winnt.dll'</strong> replace it!</p>

<p>After all the installations we have to add the perfmon plugin to jmeter. The process is easy and the only thing we have to do is to copy the files from the unzipped perfmon plugin folder to the jmeter equivalent folders(lib,ext)</p>

<p>If you use Mongo DB, install also the necessary .jar files:</p>
<p>Mongo: https://jar-download.com/?search_box=mongo-java-driver</p>
<p>Groovy: https://jar-download.com/artifacts/org.codehaus.groovy/groovy/2.4.4/source-code</p>
<p>Add the jar files in the bin folder of Jmeter</p>

<h2>How to use restAPI Jmeter</h2>
<p>1. Start server agent (only if you want to monitor cpu,ram,etc.)</p>
<p>Open the server agent folder, open cmd and type startAgent.bat (for Windows) or startAgent.sh (for Linux/Mac)</p>
<img alt="" src="./readme_instruction_screenshots/server_connected.png">
<p>2. Run jmeter</p>
<p>Open the bin folder pf jmeter, open cmd and type jmeter.bat (for Windows) or jmeter.sh (for Linux/Mac)</p>
<p>3. Initialize group</p>
<img alt="" src="./readme_instruction_screenshots/thread_group.png">
<p>4. Add Samplers</p>
<img alt="" src="./readme_instruction_screenshots/sampler_http.png">
<img alt="" src="./readme_instruction_screenshots/request_http.png">
<p>5. Add Listeners</p>
<img alt="" src="./readme_instruction_screenshots/listener.png">

<h2>How to use MongoDB Jmeter</h2>
<p>1. Start server agent (only if you want to monitor cpu,ram,etc.)</p>
<p>Open the server agent folder, open cmd and type startAgent.bat (for Windows) or startAgent.sh (for Linux/Mac)</p>
<img alt="" src="./readme_instruction_screenshots/server_connected.png">
<p>2. Run jmeter</p>
<p>Open the bin folder pf jmeter, open cmd and type jmeter.bat (for Windows) or jmeter.sh (for Linux/Mac)</p>
<p>3. Initialize group</p>
<img alt="" src="./readme_instruction_screenshots/thread_group.png">
<p>4. Add Samplers</p>
<img alt="" src="./readme_instruction_screenshots/sampler_mongo.png">
<img alt="" src="./readme_instruction_screenshots/request_http.png">
<p>5. Add Listeners</p>
<img alt="" src="./readme_instruction_screenshots/listener.png">

<h2>💻 Built with</h2>
Technologies used in the project:

- MongoDB
- Java
- Jmeter
