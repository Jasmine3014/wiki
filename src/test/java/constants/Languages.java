package constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Languages {
    SPANISH("es");

    private final String language;
}
