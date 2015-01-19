
CREATE OR REPLACE PROCEDURE alimentosCaducados(fechActual IN date, cursorCaducados OUT sys_refcursor, PV_ERROR OUT varchar2) IS
	
BEGIN
	
	OPEN cursorCaducados FOR
	SELECT *
	FROM ALIMENTO
	WHERE fechActual>fecha_caducidad;

--	EXCEPTION
--		WHEN NO_DATA_FOUND THEN
--			PV_ERROR := "La fecha no existe; 
--		WHEN OTHERS THEN
--			PV_ERROR := "alimentos Caducados" ||"-"|| sqlerrm;


END alimentosCaducados;
