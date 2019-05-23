<%@  include file="header.html"%>
		<main>
			<section>
				<h2>Liste des livres</h2>
				<table border="1" cellpadding="5">
					<thead>
						<tr>
							<th>Titre</th>
							<th>Auteur</th>
							<th>Prix</th>
							<th>Genre</th>
							<th>Supprimer</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="element" items="${simpleList}">
						<tr>
							<td><c:out value="${element.getTitre()}"></c:out></td>
							<td><c:out value="${element.getAuteur()}"></c:out></td>
							<td><c:out value="${element.getPrix()}"></c:out></td>									
							<td><c:out value="${element.getGenre()}"></c:out></td>
							<td><input type="button" value="${element.getId_livre()}" name="deletefromList" onclick="deleteRow(this)"></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</section>
			<section>
				<h2>Ajouter un livre</h2>
				<form action="livreGestion" method="post" class="form-example">
				  <div class="form-example">
				    <label for="titre">Entrez le titre: </label>
				    <input type="text" name="titre" id="titre" required>
				  </div>
				  <div class="form-example">
				    <label for="auteur">Entrez l'auteur: </label>
				    <input type="text" name="auteur" id="auteur" required>
				  </div>
				  <div class="form-example">
				    <label for="prix">Entrez le prix </label>
				    <input type="number" name="prix" id="prix" required>
				  </div>
				  <div class="form-example">
				    <label for="genre">Entrez le genre </label>
				    <input type="text" name="genre" id="genre" required>
				  </div>
				  <div class="form-example">
				    <input type="submit" value="Ajouter">
				  </div>
				</form>
			</section>
				<section>
				<h2>Modifier un livre</h2>
				<form action="managerlivre" method="post" class="form-example">
				  <div>
				  	<label for="id">Sélectionnez l'id du titre à modifier</label>
				  	<select name="id" id="id" required>
					    <option value="">--Please choose an option--</option>
					    <c:forEach var="element" items="${simpleList}">
					    	<option value="${element.getId_livre()}">Livre avec l'id <c:out value="${element.getId_livre()}"></c:out></option>
					    </c:forEach>
					</select>
				  </div>
				  <div class="form-example">
				    <label for="titre">Entrez la modification du titre: </label>
				    <input type="text" name="titre" id="titre" required>
				  </div>
				  <div class="form-example">
				    <label for="auteur">Entrez la modification de l'auteur: </label>
				    <input type="text" name="auteur" id="auteur" required>
				  </div>
				  <div class="form-example">
				    <label for="prix">Entrez la modification du prix </label>
				    <input type="number" name="prix" id="prix" required>
				  </div>
				  <div class="form-example">
				    <label for="genre">Entrez la modification du genre </label>
				    <input type="text" name="genre" id="genre" required>
				  </div>
				  <div class="form-example">
				    <input type="submit" value="Modifier">
				  </div>
				</form>
			</section>
		</main>
<%@  include file="footer.html"%>